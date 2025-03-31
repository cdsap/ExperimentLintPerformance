package com.performance.module_4_282

class Feature282UseCase2(
    private val repository: Feature282Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
