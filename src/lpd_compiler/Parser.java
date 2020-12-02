package lpd_compiler;

import java.io.IOException;

public abstract class Parser {

	TS ts;
	Lexer lexer;
	Token token;	
	
	public Parser() {
		ts = new TS();
		lexer = new Lexer(ts);
	}

	public abstract void parse();
	
	public Token buscaToken() throws IOException {
		token = lexer.buscaToken();
		return token;
	}
	
	public boolean erro(Token token) {
		System.out.println("ERRO no token: " + token.lexema + " | Linha: " + token.linha + " | Coluna: " + token.coluna);
		
		return false;
	}
	
	
}
