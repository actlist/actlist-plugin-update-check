import java.net.URI;

import org.silentsoft.actlist.plugin.ActlistPlugin;

public class Plugin extends ActlistPlugin {

	public static void main(String[] args) {
		debug();
	}
	
	public Plugin() throws Exception {
		super("[sample] update check");
		
		setPluginVersion("1.2.0");
		setPluginUpdateCheckURI(URI.create("https://github.com/silentsoft/actlist-plugin-update-check/raw/master/update-check.js"));
	}

	@Override
	protected void initialize() throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void pluginActivated() throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void pluginDeactivated() throws Exception {
		// TODO Auto-generated method stub
	}

}
