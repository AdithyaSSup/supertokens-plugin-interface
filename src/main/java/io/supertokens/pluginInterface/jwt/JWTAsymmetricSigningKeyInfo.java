/*
 *    Copyright (c) 2021, VRAI Labs and/or its affiliates. All rights reserved.
 *
 *    This software is licensed under the Apache License, Version 2.0 (the
 *    "License") as published by the Apache Software Foundation.
 *
 *    You may not use this file except in compliance with the License. You may
 *    obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *    License for the specific language governing permissions and limitations
 *    under the License.
 */

package io.supertokens.pluginInterface.jwt;

public class JWTAsymmetricSigningKeyInfo extends JWTSigningKeyInfo {
    public String publicKey;
    public String privateKey;

    public JWTAsymmetricSigningKeyInfo(String keyId, long createdAtTime, String algorithm, String publicKey,
            String privateKey) {
        super(keyId, createdAtTime, algorithm, publicKey + "|" + privateKey);
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public JWTAsymmetricSigningKeyInfo(String keyId, long createdAtTime, String algorithm, String keyString) {
        this(keyId, createdAtTime, algorithm, keyString.split("\\|")[0], keyString.split("\\|")[1]);
    }
}
