package butterknife;

import android.support.annotation.AttrRes;
import android.support.annotation.DrawableRes;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static butterknife.internal.Constants.NO_RES_ID;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Bind a field to the specified drawable resource ID.
 * 将字段绑定到指定的可绘制资源ID。
 * <pre><code>
 * {@literal @}BindDrawable(R.drawable.placeholder)
 * Drawable placeholder;
 * {@literal @}BindDrawable(value = R.drawable.placeholder, tint = R.attr.colorAccent)
 * Drawable tintedPlaceholder;
 * </code></pre>
 */
@Target(FIELD)
@Retention(RUNTIME)
public @interface BindDrawable {
  /** Drawable resource ID to which the field will be bound.
   * 字段将绑定到的可绘制资源ID */
  @DrawableRes int value();

  /** Color attribute resource ID that is used to tint the drawable.
   * 颜色属性资源ID，用于为可drawable着色。
   * */
  @AttrRes int tint() default NO_RES_ID;
}
