package com.performance.module_2_229

class Feature229UseCase2(
    private val repository: Feature229Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
