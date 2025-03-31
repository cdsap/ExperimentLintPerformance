package com.performance.module_1_140

class Feature140UseCase2(
    private val repository: Feature140Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
