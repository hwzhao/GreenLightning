package com.ociweb.gl.impl;

import com.ociweb.gl.impl.schema.MessageSubscription;
import com.ociweb.pronghorn.pipe.Pipe;

public class MessageReader extends PayloadReader<MessageSubscription> {

	public MessageReader(Pipe<MessageSubscription> pipe) {
		super(pipe);
	}
	
}
