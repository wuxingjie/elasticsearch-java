/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._global.get_script_context;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.get_script_context.ContextMethodParam
public final class ContextMethodParam implements ToJsonp {
	private final String name;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected ContextMethodParam(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ContextMethodParam}.
	 */
	public static class Builder implements ObjectBuilder<ContextMethodParam> {
		private String name;

		private String type;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link ContextMethodParam}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ContextMethodParam build() {

			return new ContextMethodParam(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ContextMethodParam
	 */
	public static final JsonpValueParser<ContextMethodParam> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ContextMethodParam::setupContextMethodParamParser);

	protected static void setupContextMethodParamParser(DelegatingJsonpValueParser<ContextMethodParam.Builder> op) {

		op.add(Builder::name, JsonpValueParser.stringParser(), "name");
		op.add(Builder::type, JsonpValueParser.stringParser(), "type");

	}

}