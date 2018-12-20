package butterknife;

import android.support.annotation.UiThread;

/** An unbinder contract that will unbind views when called.
 *  当前对象 解绑所有绑定的view
 * */
public interface Unbinder {
  @UiThread void unbind();

  Unbinder EMPTY = () -> { };
}
