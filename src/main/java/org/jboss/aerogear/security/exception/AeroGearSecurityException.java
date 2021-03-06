/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.security.exception;

/**
 * General exception thrown due to an error during the Authentication/Authorization process.
 */
public class AeroGearSecurityException extends RuntimeException {

    private int status;

    /**
     * Constructs a new <i>AeroGearSecurityException</i> with HTTP status response mapped from the supplied exception at {@link HttpExceptionMapper}.
     *
     * @param httpStatus
     */
    public AeroGearSecurityException(HttpStatus httpStatus) {
        super(httpStatus.getMessage());
        this.status = httpStatus.getCode();
    }

    /**
     * Current HTTP status
     *
     * @return HTTP response code
     */
    public int getStatus() {
        return status;
    }

    /**
     * HTTP response message
     *
     * @return response message
     */
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
