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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.NlpRobertaTokenizationConfig

/**
 * RoBERTa tokenization configuration options
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.NlpRobertaTokenizationConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class NlpRobertaTokenizationConfig implements TokenizationConfigVariant, JsonpSerializable {
	@Nullable
	private final Boolean addPrefixSpace;

	@Nullable
	private final Boolean withSpecialTokens;

	@Nullable
	private final Integer maxSequenceLength;

	@Nullable
	private final TokenizationTruncate truncate;

	@Nullable
	private final Integer span;

	// ---------------------------------------------------------------------------------------------

	private NlpRobertaTokenizationConfig(Builder builder) {

		this.addPrefixSpace = builder.addPrefixSpace;
		this.withSpecialTokens = builder.withSpecialTokens;
		this.maxSequenceLength = builder.maxSequenceLength;
		this.truncate = builder.truncate;
		this.span = builder.span;

	}

	public static NlpRobertaTokenizationConfig of(Function<Builder, ObjectBuilder<NlpRobertaTokenizationConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenizationConfig variant kind.
	 */
	@Override
	public TokenizationConfig.Kind _tokenizationConfigKind() {
		return TokenizationConfig.Kind.Roberta;
	}

	/**
	 * Should the tokenizer prefix input with a space character
	 * <p>
	 * API name: {@code add_prefix_space}
	 */
	@Nullable
	public final Boolean addPrefixSpace() {
		return this.addPrefixSpace;
	}

	/**
	 * Is tokenization completed with special tokens
	 * <p>
	 * API name: {@code with_special_tokens}
	 */
	@Nullable
	public final Boolean withSpecialTokens() {
		return this.withSpecialTokens;
	}

	/**
	 * Maximum input sequence length for the model
	 * <p>
	 * API name: {@code max_sequence_length}
	 */
	@Nullable
	public final Integer maxSequenceLength() {
		return this.maxSequenceLength;
	}

	/**
	 * Should tokenization input be automatically truncated before sending to the
	 * model for inference
	 * <p>
	 * API name: {@code truncate}
	 */
	@Nullable
	public final TokenizationTruncate truncate() {
		return this.truncate;
	}

	/**
	 * Tokenization spanning options. Special value of -1 indicates no spanning
	 * takes place
	 * <p>
	 * API name: {@code span}
	 */
	@Nullable
	public final Integer span() {
		return this.span;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.addPrefixSpace != null) {
			generator.writeKey("add_prefix_space");
			generator.write(this.addPrefixSpace);

		}
		if (this.withSpecialTokens != null) {
			generator.writeKey("with_special_tokens");
			generator.write(this.withSpecialTokens);

		}
		if (this.maxSequenceLength != null) {
			generator.writeKey("max_sequence_length");
			generator.write(this.maxSequenceLength);

		}
		if (this.truncate != null) {
			generator.writeKey("truncate");
			this.truncate.serialize(generator, mapper);
		}
		if (this.span != null) {
			generator.writeKey("span");
			generator.write(this.span);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NlpRobertaTokenizationConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NlpRobertaTokenizationConfig> {
		@Nullable
		private Boolean addPrefixSpace;

		@Nullable
		private Boolean withSpecialTokens;

		@Nullable
		private Integer maxSequenceLength;

		@Nullable
		private TokenizationTruncate truncate;

		@Nullable
		private Integer span;

		/**
		 * Should the tokenizer prefix input with a space character
		 * <p>
		 * API name: {@code add_prefix_space}
		 */
		public final Builder addPrefixSpace(@Nullable Boolean value) {
			this.addPrefixSpace = value;
			return this;
		}

		/**
		 * Is tokenization completed with special tokens
		 * <p>
		 * API name: {@code with_special_tokens}
		 */
		public final Builder withSpecialTokens(@Nullable Boolean value) {
			this.withSpecialTokens = value;
			return this;
		}

		/**
		 * Maximum input sequence length for the model
		 * <p>
		 * API name: {@code max_sequence_length}
		 */
		public final Builder maxSequenceLength(@Nullable Integer value) {
			this.maxSequenceLength = value;
			return this;
		}

		/**
		 * Should tokenization input be automatically truncated before sending to the
		 * model for inference
		 * <p>
		 * API name: {@code truncate}
		 */
		public final Builder truncate(@Nullable TokenizationTruncate value) {
			this.truncate = value;
			return this;
		}

		/**
		 * Tokenization spanning options. Special value of -1 indicates no spanning
		 * takes place
		 * <p>
		 * API name: {@code span}
		 */
		public final Builder span(@Nullable Integer value) {
			this.span = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NlpRobertaTokenizationConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NlpRobertaTokenizationConfig build() {
			_checkSingleUse();

			return new NlpRobertaTokenizationConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NlpRobertaTokenizationConfig}
	 */
	public static final JsonpDeserializer<NlpRobertaTokenizationConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NlpRobertaTokenizationConfig::setupNlpRobertaTokenizationConfigDeserializer);

	protected static void setupNlpRobertaTokenizationConfigDeserializer(
			ObjectDeserializer<NlpRobertaTokenizationConfig.Builder> op) {

		op.add(Builder::addPrefixSpace, JsonpDeserializer.booleanDeserializer(), "add_prefix_space");
		op.add(Builder::withSpecialTokens, JsonpDeserializer.booleanDeserializer(), "with_special_tokens");
		op.add(Builder::maxSequenceLength, JsonpDeserializer.integerDeserializer(), "max_sequence_length");
		op.add(Builder::truncate, TokenizationTruncate._DESERIALIZER, "truncate");
		op.add(Builder::span, JsonpDeserializer.integerDeserializer(), "span");

	}

}
