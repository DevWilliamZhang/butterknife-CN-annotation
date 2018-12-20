package butterknife;

import android.support.annotation.AnimRes;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Bind a field to the specified animation resource ID.
 * 将字段绑定到指定的动画资源ID。
 * <pre><code>
 * {@literal @}BindAnim(R.anim.fade_in) Animation fadeIn;
 * </code></pre>
 */
@Target(FIELD)
@Retention(RUNTIME)
public @interface BindAnim {
  /** Animation resource ID to which the field will be bound.
   * 将字段绑定到的动画资源ID
   * */
  @AnimRes int value();
}
