package butterknife;

import android.support.annotation.StringRes;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Bind a field to the specified string resource ID.
 * 将字段绑定到指定的字符串资源ID。
 * <pre><code>
 * {@literal @}BindString(R.string.username_error) String usernameErrorText;
 * </code></pre>
 */
@Retention(RUNTIME) @Target(FIELD)
public @interface BindString {
  /** String resource ID to which the field will be bound.
   * 将字段绑定到的字符串资源ID */
  @StringRes int value();
}
