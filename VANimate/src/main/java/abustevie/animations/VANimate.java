package abustevie.animations;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;

public final class VANimate {

    private VANimate() {} // prevent instantiation

    // ===========================
    // 🔵 SHAKE
    // ===========================
    public static void shake(View view) {
        shake(view, 2, 7, 50);      // pre-programmed animation arguments
    }

    public static void shake(final View view, final int angle, final int times, final int duration) {

        if (!isValid(view, times, duration)) return;    // argument validity check

        view.animate().cancel();        // stop previous animations

        if (times == 1) {               // Base case: this condition stops the recursive calls
            view.animate()
                    .rotation(0)
                    .setDuration(duration)
                    .setInterpolator(new AccelerateDecelerateInterpolator());
            return;
        }

        view.animate()                              // animate transform motion
                .rotation(angle)
                .setDuration(duration)
                .setInterpolator(new OvershootInterpolator())
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {             // recursive call w times-1
                        shake(view, -angle, times - 1, duration);
                    }
                });
    }


    // ===========================
    // 🔵 FLICKER
    // ===========================
    public static void flicker(View view) {
        flicker(view, 0.75f, 7, 35);    // pre-programmed animation arguments
    }

    public static void flicker(final View view, final float depth, final int times, final int duration) {

        if (!isValid(view, times, duration)) return;    // argument validity check

        view.animate().cancel();                        // stop previous animations

        if (times == 1) {                   // Base case: this condition stops the recursive calls
            view.animate()
                    .alpha(1f)
                    .setDuration(duration)
                    .setInterpolator(new AccelerateDecelerateInterpolator());
            return;
        }

        view.animate()                                  // animate transform motion
                .alpha(depth)
                .setDuration(duration)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {                 // recursive call w times-1
                        flicker(view, 1 - depth, times - 1, duration);
                    }
                });
    }


    // ===========================
    // 🔵 ZIGZAG
    // ===========================
    public static void zigzag(View view) {
        zigzag(view, 8, 9, 80);     // pre-programmed animation arguments
    }

    public static void zigzag(final View view, final int depth, final int times, final int duration) {

        if (!isValid(view, times, duration)) return;    // argument validity check

        view.animate().cancel();                        // stop previous animations

        if (times == 1) {                   // Base case: this condition stops the recursive calls
            view.animate()
                    .translationX(0)
                    .translationY(0)
                    .setDuration(duration)
                    .setInterpolator(new AccelerateDecelerateInterpolator());
            return;
        }

        view.animate()                                  // animate transform motion
                .translationX(depth)
                .translationY(-depth)
                .setDuration(duration)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {                 // recursive call w times-1
                        zigzag(view, -depth, times - 1, Math.round(duration * 0.75f));
                    }
                });
    }


    // ===========================
    // 🔵 TWINKLE
    // ===========================
    public static void twinkle(View view) {
        twinkle(view, 0.8f, 7, 50); // pre-programmed animation arguments
    }

    public static void twinkle(final View view, final float depth, final int times, final int duration) {

        if (!isValid(view, times, duration)) return;    // argument validity check

        view.animate().cancel();                        // stop previous animations

        if (times == 1) {               // Base case: this condition stops the recursive calls
            view.animate()
                    .scaleX(1f)
                    .scaleY(1f)
                    .setDuration(duration)
                    .setInterpolator(new OvershootInterpolator());
            return;
        }

        view.animate()                                  // animate transform motion
                .scaleX(depth)
                .scaleY(depth)
                .setDuration(duration)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {

                        view.animate()
                                .scaleX(1f)
                                .scaleY(1f)
                                .setDuration(duration)
                                .setInterpolator(new AccelerateDecelerateInterpolator())
                                .withEndAction(new Runnable() {
                                    @Override
                                    public void run() {     // recursive call w times-1
                                        float nextDepth = depth + (1 - depth) / 2;
                                        int nextDur = Math.round(duration * 1.25f);
                                        twinkle(view, nextDepth, times - 1, nextDur);
                                    }
                                });
                    }
                });
    }


    // ===========================
    // 🔒 SAFETY CHECK
    // ===========================
    private static boolean isValid(View view, int times, int duration) {
        return view != null && times > 0 && duration > 0;
    }
}
