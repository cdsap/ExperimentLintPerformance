package com.performance.module_2_231

class Feature231UseCase0(
    private val repository: Feature231Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
