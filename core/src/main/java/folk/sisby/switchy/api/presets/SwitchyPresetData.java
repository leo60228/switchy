package folk.sisby.switchy.api.presets;

import folk.sisby.switchy.api.SwitchySerializable;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.ApiStatus;

import java.util.Map;

/**
 * @author Sisby folk
 * @since 2.0.0
 *
 */
public interface SwitchyPresetData<Module extends SwitchySerializable> extends SwitchySerializable {
	@ApiStatus.Internal
	Map<Identifier, Module> getModules();

	@ApiStatus.Internal
	Module getModule(Identifier id);

	@ApiStatus.Internal
	void putModule(Identifier id, Module module);

	boolean containsModule(Identifier id);

	void removeModule(Identifier id);

	String getName();

	void setName(String name);
}
