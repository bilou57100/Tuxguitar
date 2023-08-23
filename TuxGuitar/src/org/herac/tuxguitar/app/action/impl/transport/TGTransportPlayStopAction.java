package org.herac.tuxguitar.app.action.impl.transport;

import org.herac.tuxguitar.action.TGActionContext;
import org.herac.tuxguitar.app.transport.TGTransport;
import org.herac.tuxguitar.editor.action.TGActionBase;
import org.herac.tuxguitar.util.TGContext;

public class TGTransportPlayStopAction extends TGActionBase {
	
	public static final String NAME = "action.transport.playStop";
	
	public TGTransportPlayStopAction(TGContext context) {
		super(context, NAME);
	}
	
	protected void processAction(TGActionContext context){
		TGTransport.getInstance(getContext()).playStop();
	}
}
