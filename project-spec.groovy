/*
 * Copyright (c) 2010-2010 LinkedIn, Inc
 * Portions Copyright (c) 2012-2013 Yan Pujante
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

spec = [
  name: 'utils-zookeeper',
  group: 'org.pongasoft',
  version: '2.0.0',

  versions: [
    jdk: '1.7',
    groovy: '2.0.7',
    utilsMisc: '2.0.0',
    slf4j: '1.6.2' // to be compatible with grails 2.2.1
  ],

  // information about the build framework itself
  build: [
    type: "gradle",
    commands: [
      "snapshot": "./gradlew xxx",
      "release": "./gradlew -Prelease=true xxx"
    ]
  ]
]

spec.scmUrl = "git@github.com:pongasoft/${spec.name}.git"
spec.scm = 'git'

/**
 * External dependencies
 */
spec.external = [
  commonsCli: 'commons-cli:commons-cli:1.2',
  groovy: "org.codehaus.groovy:groovy-all:${spec.versions.groovy}",
  groovyTest: "org.codehaus.groovy:groovy-test:${spec.versions.groovy}",
  junit: 'junit:junit:4.10',
  utilsMiscCore: "org.pongasoft:org.linkedin.util-core:${spec.versions.utilsMisc}",
  utilsMiscGroovy: "org.pongasoft:org.linkedin.util-groovy:${spec.versions.utilsMisc}",
  log4j: 'log4j:log4j:1.2.16',
  slf4j: "org.slf4j:slf4j-api:${spec.versions.slf4j}",
  slf4jLog4j: "org.slf4j:slf4j-log4j12:${spec.versions.slf4j}",
  slf4jJul: "org.slf4j:jul-to-slf4j:${spec.versions.slf4j}",
  zookeeper: 'org.apache.zookeeper:zookeeper:3.4.5'
]

// information about the bintray distribution
spec.bintray = [
  apiBaseUrl: 'https://bintray.com/api/v1',
  username: 'yan',
  pkgOrganization: 'pongasoft',
  repositories: [
    binaries: [
      pkgRepository: 'binaries',
      pkgName: spec.name
    ],
    distributions: [
      pkgRepository: spec.name,
      pkgName: 'releases'
    ],
  ]
]

