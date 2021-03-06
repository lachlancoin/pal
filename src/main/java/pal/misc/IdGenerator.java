// IdGenerator.java
//
// (c) 1999-2001 PAL Development Core Team
//
// This package may be distributed under the
// terms of the Lesser GNU General Public License (LGPL)

package pal.misc;

import java.math.*;
import pal.io.*;

/**
 * Generates IdGroup objects given certain parameters. 
 * 
 * @version $Id: IdGenerator.java,v 1.3 2001/07/13 14:39:13 korbinian Exp $
 *
 * @author Alexei Drummond
 */
public class IdGenerator {

	/**
	 * generates a group of unique identifiers numbered from zero.
	 */
	public static IdGroup createIdGroup(int size) {
	
		int width = (int)Math.ceil(Math.log(size) / Math.log(10.0));
	
		IdGroup idGroup = new SimpleIdGroup(size);
	
		String name;
		for (int i = 0; i < size; i++) {
			name = (new Integer(i)).toString();
			name = FormattedOutput.space(width - name.length(), '0') + name;
			idGroup.setIdentifier(i, new Identifier(name));
		}
	
		return idGroup;
	}	
}

