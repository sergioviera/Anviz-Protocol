/*
 *
 * Copyright 2012 Monits
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
 *
 */
package com.monits.anviz.net.packet;

import com.monits.jpack.annotation.DependsOn;
import com.monits.jpack.annotation.Encode;
import com.monits.jpack.annotation.Unsigned;

public class Response {
	
	public static final short SUCCESS = 0x00;

	@Encode(0)
	@Unsigned
	private short magic;
	
	@Encode(1)
	@Unsigned
	private long deviceCode;
	
	@Encode(2)
	@Unsigned
	private short command;
	
	@Encode(3)
	@Unsigned
	private short ack;
	
	@Encode(4)
	@Unsigned
	private int length;
	
	@Encode(5)
	@DependsOn({ "length" })
	private byte[] data;
	
	@Encode(6)
	private byte checksumLow;

	@Encode(7)
	private byte checksumHigh;

	public short getMagic() {
		return magic;
	}

	public void setMagic(short magic) {
		this.magic = magic;
	}

	public long getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(long deviceCode) {
		this.deviceCode = deviceCode;
	}

	public short getCommand() {
		return command;
	}

	public void setCommand(short command) {
		this.command = command;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public byte getChecksumLow() {
		return checksumLow;
	}

	public void setChecksumLow(byte checksumLow) {
		this.checksumLow = checksumLow;
	}

	public byte getChecksumHigh() {
		return checksumHigh;
	}

	public void setChecksumHigh(byte checksumHigh) {
		this.checksumHigh = checksumHigh;
	}

	public short getAck() {
		return ack;
	}

	public void setAck(short ack) {
		this.ack = ack;
	}
	
}
