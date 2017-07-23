package com.ociweb.gl.impl.stage;

import com.ociweb.pronghorn.pipe.Pipe;

public class ReactiveManagerPipeConsumer {

	public final Pipe[] inputs;
	private final ReactiveOperator[] operators;
	private final Object obj;
	
	public ReactiveManagerPipeConsumer(Object obj, ReactiveOperators operators, Pipe[] inputs) {
		
		this.obj = obj;
		this.inputs = inputs;
		this.operators = new ReactiveOperator[inputs.length];
		
		int i = inputs.length;
		while (--i>=0) {
			this.operators[i] = operators.getOperator(inputs[i]);
		}
	}
	
	public void process(ReactiveListenerStage r) {
		int i = inputs.length;
		while (--i>=0) {
			operators[i].apply(obj, inputs[i], r);
		}
	}
	
}