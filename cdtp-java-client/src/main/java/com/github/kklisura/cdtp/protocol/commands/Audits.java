package com.github.kklisura.cdtp.protocol.commands;

import com.github.kklisura.cdtp.protocol.annotations.Experimental;
import com.github.kklisura.cdtp.protocol.annotations.Optional;
import com.github.kklisura.cdtp.protocol.types.audits.EncodedResponse;
import com.github.kklisura.cdtp.protocol.types.audits.Encoding;

/**
 * Audits domain allows investigation of page violations and possible improvements.
 */
@Experimental
public interface Audits {

	/**
	 * Returns the response body and size if it were re-encoded with the specified settings. Only applies to images.
	 */
	EncodedResponse getEncodedResponse(String requestId, Encoding encoding, @Optional Double quality, @Optional Boolean sizeOnly);
}