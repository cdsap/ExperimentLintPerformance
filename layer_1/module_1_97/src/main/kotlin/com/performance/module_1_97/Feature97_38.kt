package com.performance.module_1_97

class Feature97UseCase2(
    private val repository: Feature97Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
