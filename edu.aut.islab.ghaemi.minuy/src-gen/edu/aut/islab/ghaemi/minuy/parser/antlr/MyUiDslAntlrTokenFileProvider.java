/*
 * generated by Xtext 2.10.0
 */
package edu.aut.islab.ghaemi.minuy.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyUiDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("edu/aut/islab/ghaemi/minuy/parser/antlr/internal/InternalMyUiDsl.tokens");
	}
}
