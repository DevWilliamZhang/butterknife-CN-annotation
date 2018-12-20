package butterknife;

import android.support.annotation.IdRes;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Bind a field to the view for the specified ID. The view will automatically be cast to the field
 * type.
 * 绑定指定id 的view 给成员变量，view会自动转换成相应类型
 * <pre><code>
 * {@literal @}BindView(R.id.title) TextView title;
 * </code></pre>
 */
@Retention(RUNTIME) @Target(FIELD)
public @interface BindView {
  /** View ID to which the field will be bound.
   *  绑定此view 的id值 {R.id.xxx}
   * */
  @IdRes int value();
}
