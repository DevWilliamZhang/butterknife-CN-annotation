package butterknife;

import android.support.annotation.DimenRes;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Bind a field to the specified dimension resource ID. Type can be {@code int} for pixel size or
 * {@code float} for exact amount.
 * 将字段绑定到指定的维度资源ID。类型可以是{@code int}，表示像素大小或
 * {@code float}表示准确的金额。
 * <pre><code>
 * {@literal @}BindDimen(R.dimen.horizontal_gap) int gapPx;
 * {@literal @}BindDimen(R.dimen.horizontal_gap) float gap;
 * </code></pre>
 */
@Target(FIELD)
@Retention(RUNTIME)
public @interface BindDimen {
  /** Dimension resource ID to which the field will be bound. */
  @DimenRes int value();
}
