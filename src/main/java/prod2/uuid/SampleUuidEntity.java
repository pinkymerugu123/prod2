package prod2.uuid;

import org.restexpress.plugin.hyperexpress.Linkable;
import prod2.Constants;
import prod2.serialization.UuidFormatter;

import com.strategicgains.hyperexpress.annotation.BindToken;
import com.strategicgains.hyperexpress.annotation.TokenBindings;
import com.strategicgains.repoexpress.domain.AbstractUuidEntity;

@TokenBindings({
	@BindToken(value=Constants.Url.UUID, field="id", formatter=UuidFormatter.class)
})
public class SampleUuidEntity
extends AbstractUuidEntity
implements Linkable
{
	public SampleUuidEntity()
	{
	}
}
