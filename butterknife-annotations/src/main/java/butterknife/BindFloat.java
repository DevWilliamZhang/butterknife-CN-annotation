package butterknife;

import android.support.annotation.DimenRes;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Bind a field to the specified dimension resource ID whose type is explicitly defined as float.
 * 将字段绑定到其类型显式定义为float的指定维度资源ID
 * <p>
 * This is different than simply reading a normal dimension as a float value which
 * {@link BindDimen @BindDimen} supports. The resource must be defined as a float like
 * {@code <item name="whatever" format="float" type="dimen">1.1</item>}.
 * 这与简单地将普通尺寸值读取为浮点值不同
 *  {@link BindDimen @BindDimen}支持资源必须定义为一个类似于float的
 * {@code <item name="whatever" format="float" type="dimen">1.1</item>}.
 * <pre><code>
 * {@literal @}BindFloat(R.dimen.image_ratio) float imageRatio;
 * </code></pre>
 */
@Target(FIELD)
@Retention(RUNTIME)
public @interface BindFloat {
  /** Float resource ID to which the field will be bound.
   *将字段绑定到的浮动资源ID。
   * */
  @DimenRes int value();
}
