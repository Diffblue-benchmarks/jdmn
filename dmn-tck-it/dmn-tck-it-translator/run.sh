#!/bin/bash

set -x
COVER_RECORD_ALL_CTORS=y COVER_MAX_IPM=1600 COVER_LOG_LEVEL=none MAVEN_OPTS='-javaagent:/tmp/dcover-agent.jar' mvn generate-sources 
