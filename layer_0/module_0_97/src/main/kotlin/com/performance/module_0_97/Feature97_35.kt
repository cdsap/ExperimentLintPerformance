package com.performance.module_0_97

class Feature97UseCase1(
    private val repository: Feature97Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
