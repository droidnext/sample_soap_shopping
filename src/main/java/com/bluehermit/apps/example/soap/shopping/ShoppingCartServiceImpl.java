/*
 * Copyright 2015 bluehermit.com
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
package com.bluehermit.apps.example.soap.shopping;

import javax.jws.WebService;


@WebService(endpointInterface = "com.bluehermit.apps.example.soap.shopping.ShoppingCartService",
serviceName = "ShoppingCartService"
//targetNamespace = "com.bluehermit.apps.example.soap.shopping"
)
public class ShoppingCartServiceImpl implements ShoppingCartService {

	public Receipt buy(Cart cart) {
		
		StringBuilder sb = new StringBuilder();
		for( String item:cart.getItems())
		{
			sb.append(item+"  \n");
		}
		Receipt receipt =new Receipt();
		receipt.setPrintItems(sb.toString());
		return receipt;
	}
}
