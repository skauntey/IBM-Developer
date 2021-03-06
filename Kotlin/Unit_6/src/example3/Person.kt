/*
 * Copyright 2018 Makoto Consulting Group, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.makotogo.learn.kotlin.example3

import java.time.LocalDate

class Person(val givenName: String, val familyName: String, val dateOfBirth: LocalDate) {
    override fun toString(): String {
        return "[givenName=$givenName, familyName=$familyName, dateOfBirth=$dateOfBirth]"
    }
}

fun main(args: Array<String>) {
    val person = Person(
            "Susan",
            "Neumann",
            LocalDate.of(1980, 3, 17) // 17 Mar 1980
    )
    println(person)
}
