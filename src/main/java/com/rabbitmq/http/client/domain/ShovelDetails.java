/*
 * Copyright 2015 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.rabbitmq.http.client.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

//{"src-uri":  "amqp://",              "src-queue":  "my-queue",
//    "dest-uri": "amqp://remote-server", "dest-queue": "another-queue"}

public class ShovelDetails {

	@JsonProperty("src-uri")
	private String sourceURI;
	@JsonProperty("src-exchange")
	private String sourceExchange;
	@JsonProperty("src-exchange-key")
	private String sourceExchangeKey;
	@JsonProperty("src-queue")
	private String sourceQueue;
	@JsonProperty("src-prefetch-count")
	private Long sourcePrefetchCount;
	@JsonProperty("src-delete-after")
	private String sourceDeleteAfter;

	@JsonProperty("dest-uri")
	private String destinationURI;
	@JsonProperty("dest-exchange")
	private String destinationExchange;
	@JsonProperty("dest-exchange-key")
	private String destinationExchangeKey;
	@JsonProperty("dest-queue")
	private String destinationQueue;
	@JsonProperty("dest-add-timestamp-header")
	private Boolean destinationAddTimestampHeader;

	@JsonProperty("reconnect-delay")
	private long reconnectDelay;
	@JsonProperty("add-forward-headers")
	private boolean addForwardHeaders;

	@JsonProperty("ack-mode")
	private String ackMode;

	@JsonProperty("publish-properties")
	private Map<String, Object> publishProperties;

	public ShovelDetails() {
	}

	public ShovelDetails(String sourceURI, String destURI, long reconnectDelay, boolean addForwardHeaders, Map<String, Object> publishProperties) {
		this.sourceURI = sourceURI;
		this.destinationURI = destURI;
		this.reconnectDelay = reconnectDelay;
		this.addForwardHeaders = addForwardHeaders;
		this.publishProperties = publishProperties;
	}

	public String getSourceURI() {
		return sourceURI;
	}

	public void setSourceURI(String sourceURI) {
		this.sourceURI = sourceURI;
	}

	public String getSourceExchange() {
		return sourceExchange;
	}

	public void setSourceExchange(String sourceExchange) {
		this.sourceExchange = sourceExchange;
	}

	public String getSourceExchangeKey() {
		return sourceExchangeKey;
	}

	public void setSourceExchangeKey(String sourceExchangeKey) {
		this.sourceExchangeKey = sourceExchangeKey;
	}

	public String getSourceQueue() {
		return sourceQueue;
	}

	public void setSourceQueue(String sourceQueue) {
		this.sourceQueue = sourceQueue;
	}

	public String getDestinationURI() {
		return destinationURI;
	}

	public void setDestinationURI(String destURI) {
		this.destinationURI = destURI;
	}

	public String getDestinationExchange() {
		return destinationExchange;
	}

	public void setDestinationExchange(String destExchange) {
		this.destinationExchange = destExchange;
	}

	public String getDestinationExchangeKey() {
		return destinationExchangeKey;
	}

	public void setDestinationExchangeKey(String destExchangeKey) {
		this.destinationExchangeKey = destExchangeKey;
	}


	public String getDestinationQueue() {
		return destinationQueue;
	}

	public void setDestinationQueue(String destQueue) {
		this.destinationQueue = destQueue;
	}

	public long getReconnectDelay() {
		return reconnectDelay;
	}

	public void setReconnectDelay(long reconnectDelay) {
		this.reconnectDelay = reconnectDelay;
	}

	public boolean isAddForwardHeaders() {
		return addForwardHeaders;
	}

	public void setAddForwardHeaders(boolean addForwardHeaders) {
		this.addForwardHeaders = addForwardHeaders;
	}

	public String getAckMode() {
		return ackMode;
	}

	public void setAckMode(String ackMode) {
		this.ackMode = ackMode;
	}

	public Map<String, Object> getPublishProperties() {
		return publishProperties;
	}

	public void setPublishProperties(Map<String, Object> publishProperties) {
		this.publishProperties = publishProperties;
	}

	public Long getSourcePrefetchCount() {
		return sourcePrefetchCount;
	}

	public void setSourcePrefetchCount(Long sourcePrefetchCount) {
		this.sourcePrefetchCount = sourcePrefetchCount;
	}

	public String getSourceDeleteAfter() {
		return sourceDeleteAfter;
	}

	public void setSourceDeleteAfter(String sourceDeleteAfter) {
		this.sourceDeleteAfter = sourceDeleteAfter;
	}

	public Boolean isDestinationAddTimestampHeader() {
		return destinationAddTimestampHeader;
	}

	public void setDestinationAddTimestampHeader(Boolean destinationAddTimestampHeader) {
		this.destinationAddTimestampHeader = destinationAddTimestampHeader;
	}

	@Override
	public String toString() {
		return "ShovelDetails{" +
				"sourceURI='" + sourceURI + '\'' +
				", sourceExchange='" + sourceExchange + '\'' +
				", sourceExchangeKey='" + sourceExchangeKey + '\'' +
				", sourceQueue='" + sourceQueue + '\'' +
				", sourcePrefetchCount='" + sourcePrefetchCount + '\'' +
				", sourceDeleteAfter='" + sourceDeleteAfter + '\'' +
				", destinationURI='" + destinationURI + '\'' +
				", destinationExchange='" + destinationExchange + '\'' +
				", destinationExchangeKey='" + destinationExchangeKey + '\'' +
				", destinationQueue='" + destinationQueue + '\'' +
				", destinationAddTimestampHeader=" + destinationAddTimestampHeader +
				", reconnectDelay=" + reconnectDelay +
				", addForwardHeaders=" + addForwardHeaders +
				", ackMode='" + ackMode + '\'' +
				", publishProperties=" + publishProperties +
				'}';
	}
}
