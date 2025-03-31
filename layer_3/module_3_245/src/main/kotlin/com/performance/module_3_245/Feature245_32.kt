package com.performance.module_3_245

class Feature245UseCase0(
    private val repository: Feature245Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
