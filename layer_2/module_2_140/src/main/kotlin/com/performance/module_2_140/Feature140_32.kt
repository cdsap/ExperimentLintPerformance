package com.performance.module_2_140

class Feature140UseCase0(
    private val repository: Feature140Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
