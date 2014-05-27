package experiment.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Suggested root class of all domain objects.
 */
@XmlTransient // this annotation is required by possible @XmlValue using subclasses
public abstract class AbstractDomainObject implements Serializable {
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}
