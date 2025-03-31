package com.performance.module_1_97

class Feature97UseCase0(
    private val repository: Feature97Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
