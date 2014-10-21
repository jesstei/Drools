package org.hda.eventprocessing;

import javax.ejb.Local;
import javax.jms.TextMessage;

@Local
public interface NormalizationLocal {
	void normalizeEvent(TextMessage tm);
}
