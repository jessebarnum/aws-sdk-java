/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DomainTransferability"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainTransferability implements Serializable, Cloneable, StructuredPojo {

    private String transferable;

    /**
     * @param transferable
     * @see Transferable
     */

    public void setTransferable(String transferable) {
        this.transferable = transferable;
    }

    /**
     * @return
     * @see Transferable
     */

    public String getTransferable() {
        return this.transferable;
    }

    /**
     * @param transferable
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Transferable
     */

    public DomainTransferability withTransferable(String transferable) {
        setTransferable(transferable);
        return this;
    }

    /**
     * @param transferable
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Transferable
     */

    public DomainTransferability withTransferable(Transferable transferable) {
        this.transferable = transferable.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTransferable() != null)
            sb.append("Transferable: ").append(getTransferable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainTransferability == false)
            return false;
        DomainTransferability other = (DomainTransferability) obj;
        if (other.getTransferable() == null ^ this.getTransferable() == null)
            return false;
        if (other.getTransferable() != null && other.getTransferable().equals(this.getTransferable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransferable() == null) ? 0 : getTransferable().hashCode());
        return hashCode;
    }

    @Override
    public DomainTransferability clone() {
        try {
            return (DomainTransferability) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.DomainTransferabilityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
