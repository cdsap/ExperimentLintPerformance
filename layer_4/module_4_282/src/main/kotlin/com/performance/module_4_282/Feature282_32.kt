package com.performance.module_4_282

class Feature282UseCase0(
    private val repository: Feature282Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
