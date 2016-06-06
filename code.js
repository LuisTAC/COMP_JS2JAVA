function def() {
	var arr = [1,3.5,2];
	var i=-3;
	i%=3;
	for(var i=0;i<10;i++)
		foo(arr,(i==9)||!false);
	var str=arr[0+1];
}

/*
aux = last scope;
stack<string> = nomes de scopes;

	onExit:
		aux=stack.pop();

	onEntry:
		if(aux>stack.peek())
			push(stack.peek()+".1") //1.1 -> 1.1.1.
		else
			push(aux+1) //1.1 -> 1.2
*/