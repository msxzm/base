package com.msxzm.base.serializer;

import com.msxzm.base.stream.InputStream;
import com.msxzm.base.stream.OutputStream;

import java.io.IOException;

/**
 * 可序列化接口
 * @author zenghongming
 * @date 2019/12/29 17:01
 */
public interface ISerializable {

    /**
     * 将自己写入流
     * @param outputStream OutputStream
     */
    default void writeTo(OutputStream outputStream) throws IOException {
        doWrite(outputStream);
        afterWrite();
    }

    /**
     * 执行写入
     * @param outputStream OutputStream
     * @throws IOException IOException
     */
    void doWrite(OutputStream outputStream) throws IOException;

    /**
     * 读取之后
     */
    default void afterWrite() {

    }

    /**
     * 从流中读取自己
     * @param inputStream InputStream
     */
    default void readFrom(InputStream inputStream) throws IOException {
        doRead(inputStream);
        afterRead();
    }

    /**
     * 执行读取
     * @param inputStream InputStream
     * @throws IOException IOException
     */
    void doRead(InputStream inputStream) throws IOException;

    /**
     * 写入之后
     */
    default void afterRead() {

    }
}
