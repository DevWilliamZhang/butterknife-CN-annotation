package butterknife;

import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.View;

/** An action that can be applied to a list of views.
 *  应用到一个view的序列中的统一操作
 * */
public interface Action<T extends View> {
  /** Apply the action on the {@code view} which is at {@code index} in the list.
   *  将索引为index的view进行 相关操作
   * */
  @UiThread void apply(@NonNull T view, int index);
}
