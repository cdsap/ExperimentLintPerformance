package com.performance.module_2_229

class Feature229UseCase0(
    private val repository: Feature229Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
