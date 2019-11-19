/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.openhim.mediator.messages;

import akka.actor.ActorRef;
import org.openhim.mediator.datatypes.AssigningAuthority;
import org.openhim.mediator.datatypes.Identifier;

/**
 * Lookup a patient identifier in a target domain.
 */
public class ResolvePatientIdentifier extends BaseResolveIdentifier {
    public ResolvePatientIdentifier(ActorRef requestHandler, ActorRef respondTo, Identifier identifier, AssigningAuthority targetAssigningAuthority) {
        this(requestHandler, respondTo, null, identifier, targetAssigningAuthority);
    }

    public ResolvePatientIdentifier(ActorRef requestHandler, ActorRef respondTo, String correlationId, Identifier identifier, AssigningAuthority targetAssigningAuthority) {
        super(requestHandler, respondTo, "resolve-patient-identifier", correlationId, identifier, targetAssigningAuthority);
    }
}
