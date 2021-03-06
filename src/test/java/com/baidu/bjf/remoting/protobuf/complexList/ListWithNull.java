/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.bjf.remoting.protobuf.complexList;

import java.util.List;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

/**
 * The Class ListWithNull.
 *
 * @author xiemalin
 * @since 1.10.9
 */
public class ListWithNull {
    
    /** The list. */
    @Protobuf(fieldType = FieldType.STRING)
    public List<String> list;
    
    
    /** The list 2. */
    @Protobuf(fieldType = FieldType.STRING)
    private List<String> list2;
    
    /** The list 2. */
    @Protobuf(fieldType = FieldType.STRING)
    private List<String> list3;
    
    /**
     * Sets the list 2.
     *
     * @param list2 the new list 2
     */
    public void setList2(List<String> list2) {
        this.list2 = list2;
    }
    
    /**
     * Gets the list 2.
     *
     * @return the list 2
     */
    public List<String> getList2() {
        return list2;
    }
    
}
