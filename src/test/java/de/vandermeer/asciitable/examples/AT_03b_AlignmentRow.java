/* Copyright 2016 Sven van der Meer <vdmeer.sven@mykolab.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.vandermeer.asciitable.examples;

import org.apache.commons.lang3.text.StrBuilder;

import de.svenjacobs.loremipsum.LoremIpsum;
import de.vandermeer.asciitable.AT_Row;
import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.StandardExampleAsCmd;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;

/**
 * AsciiTable example for for text alignment options (row).
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.3.1 build 170404 (04-Apr-17) for Java 1.8
 * @since      v0.0.3
 */
public class AT_03b_AlignmentRow implements StandardExampleAsCmd {

	@Override
	public void showOutput(){
		// tag::example[]
		AsciiTable at = new AsciiTable();
		String text = new LoremIpsum().getWords(9);
		at.addRule();
		at.addRow(text, text, text);
		at.addRule();
		AT_Row row = at.addRow(text, text, text);
		at.addRule();
		row.setTextAlignment(TextAlignment.RIGHT);
		System.out.println(at.render(76));
		// end::example[]
	}

	@Override
	public StrBuilder getSource(){
		String[] source = new String[]{
				"AsciiTable at = new AsciiTable();",
				"String text = new LoremIpsum().getWords(9);",
				"at.addRule();",
				"at.addRow(text, text, text);",
				"at.addRule();",
				"AT_Row row = at.addRow(text, text, text);",
				"at.addRule();",
				"row.setTextAlignment(TextAlignment.RIGHT);",
				"System.out.println(at.render(76));",
		};
		return new StrBuilder().appendWithSeparators(source, "\n");
	}

	@Override
	public String getDescription() {
		return "set text alignment for a whole row";
	}

	@Override
	public String getID() {
		return "alignment-row";
	}
}
