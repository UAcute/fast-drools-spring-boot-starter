package com.drools.core.listener;

import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author <a href="mailto:hongwen0928@outlook.com">Karas</a>
 * @date 2020/9/9
 * @since 7.37.0.Final
 */
public class DefaultRuleRuntimeEventListener implements RuleRuntimeEventListener {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void objectInserted(ObjectInsertedEvent event) {
        logger.info("===>>插入对象：{}；操作规则：{}", event.getFactHandle(), event.getRule());
    }

    @Override
    public void objectUpdated(ObjectUpdatedEvent event) {
        logger.info("===>>更新对象：{}；操作规则：{}", event.getFactHandle(), event.getRule());
    }

    @Override
    public void objectDeleted(ObjectDeletedEvent event) {
        logger.info("===>>删除对象：{}；操作规则：{}", event.getFactHandle(), event.getRule());
    }
}
