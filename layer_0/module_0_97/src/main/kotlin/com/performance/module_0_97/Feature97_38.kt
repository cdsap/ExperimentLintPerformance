package com.performance.module_0_97

class Feature97UseCase2(
    private val repository: Feature97Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
