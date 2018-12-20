package butterknife;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.view.View;

/** A setter that can apply a value to a list of views.
 *  setter 为view序列自动设置 泛型代表的监听器等 有点像闭包
 * */
public interface Setter<T extends View, V> {
  /** Set the {@code value} on the {@code view} which is at {@code index} in the list. */
  @UiThread void set(@NonNull T view, @Nullable V value, int index);
}
