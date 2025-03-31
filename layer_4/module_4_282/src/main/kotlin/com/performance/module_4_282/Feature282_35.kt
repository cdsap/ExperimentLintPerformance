package com.performance.module_4_282

class Feature282UseCase1(
    private val repository: Feature282Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
