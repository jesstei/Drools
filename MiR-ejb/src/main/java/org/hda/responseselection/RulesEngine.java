package org.hda.responseselection;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.core.io.impl.ClassPathResource;
import org.drools.io.Resource;
import org.drools.runtime.StatefulKnowledgeSession;


/**
 * Session Bean implementation class RulesEngine
 */
@Singleton
@Startup
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
public class RulesEngine {
	
	
	
    /**
     * Default constructor. 
     */
    public RulesEngine() {
        System.out.println("Ich bin's die RulesEngine... ich lebe :-)");       

    }
}
