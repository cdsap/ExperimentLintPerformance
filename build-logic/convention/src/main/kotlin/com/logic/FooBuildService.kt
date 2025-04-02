package com.logic

import com.android.build.gradle.internal.services.ServiceRegistrationAction
import org.gradle.api.Project
import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters
import org.gradle.api.services.BuildServiceParameters.None
import org.gradle.tooling.events.FinishEvent
import org.gradle.tooling.events.OperationCompletionListener

/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

abstract class FooBuildService :
    BuildService<BuildServiceParameters.None>  {

    class RegistrationAction1(project: Project, maxParallelUsages: Int?) :
        ServiceRegistrationAction<FooBuildService, None>(
            project,
            FooBuildService::class.java,
            maxParallelUsages ?: 3
        ) {
        override fun configure(parameters: BuildServiceParameters.None) {
        }
    }
}

